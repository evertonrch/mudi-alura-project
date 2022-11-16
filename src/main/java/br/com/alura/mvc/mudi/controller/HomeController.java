package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Pedido pedido = new Pedido();
        pedido.setNome("Apple iPhone 13");
        pedido.setDataEntrega(LocalDate.now());
        pedido.setValor(new BigDecimal("5.009"));
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/41NJziOSFvL._AC_SL1000_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/dp/B09T4YN9LS?ref_=Oct_DLandingS_D_19dda5e6_NA");
        pedido.setDescricao("Uma descricao qualquer");

        Pedido other = new Pedido();
        other.setNome("Apple iPhone 12");
        other.setDataEntrega(LocalDate.of(2022, 11, 23));
        other.setValor(new BigDecimal("4.399"));
        other.setUrlProduto("https://www.amazon.com.br/Iphone-Apple-Verde-64gb-Desbloqueado/dp/B08NXVN2JT?ref_=Oct_DLandingS_D_bd70703c_61");
        other.setUrlImagem("https://m.media-amazon.com/images/I/41Tv1Jq1e0L._AC_SL1000_.jpg");
        other.setDescricao("Outra descricao qualquer");

        List<Pedido> pedidos = Arrays.asList(pedido, other);
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
