package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.dto.RequisicaoPedido;
import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("formulario")
    public ModelAndView form(RequisicaoPedido requisicaoPedido) {
        ModelAndView mv = new ModelAndView("pedido/formulario");
        return mv;
    }

    @PostMapping("novo")
    public ModelAndView novo(@Valid RequisicaoPedido requisicaoPedido, BindingResult result) {
        if(result.hasErrors())
            return new ModelAndView("pedido/formulario");


        Pedido pedido = requisicaoPedido.toPedido();
        pedidoRepository.save(pedido);
        return new ModelAndView("redirect:/home");
    }
}
