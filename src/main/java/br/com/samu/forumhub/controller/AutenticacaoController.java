package br.com.samu.forumhub.controller;

import br.com.samu.forumhub.domain.usuario.DadosAutenticacao;
import br.com.samu.forumhub.domain.usuario.Usuario;
import br.com.samu.forumhub.infra.security.DadosDetalhamentoToken;
import br.com.samu.forumhub.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid DadosAutenticacao dados) {
        var authenticationToken = new UsernamePasswordAuthenticationToken(dados.login(), dados.senha());
        System.out.println("BCrypt teste (123456): " + new BCryptPasswordEncoder().encode("123456"));
        var authentication = manager.authenticate(authenticationToken); //Comparacao c BCrypt

        var tokenJWT = tokenService.gerarToken((Usuario) authentication.getPrincipal());

        return ResponseEntity.ok(new DadosDetalhamentoToken(tokenJWT));
    }
}
