package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public ModelAndView home() {
        List<Pedido> pedidos = pedidoRepository.findAll();
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("pedidos", pedidos);
        return mv;
    }

    @GetMapping("/{status}")
    public ModelAndView porStatus(@PathVariable String status) {
        List<Pedido> pedidos = pedidoRepository.findByStatus(StatusPedido.valueOf(status.toUpperCase()));
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("pedidos", pedidos);
        mv.addObject("status", status);
        return mv;
    }
    @ExceptionHandler(IllegalArgumentException.class)
    public ModelAndView exceptionHandler() {
        return new ModelAndView("redirect:/home");
    }
}
