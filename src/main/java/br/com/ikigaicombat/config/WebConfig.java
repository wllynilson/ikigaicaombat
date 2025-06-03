package br.com.ikigaicombat.config; // Ou um pacote de configuração adequado

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Aplica a todas as rotas da sua API
                .allowedOrigins(
                        "http://localhost:63342", // Se você usa o servidor embutido do IntelliJ
                        "http://127.0.0.1:63342", // Alternativa para localhost
                        "http://localhost:8000",  // Exemplo se você usar 'python -m http.server 8000' localmente
                        "https://www.ikigaicombat.com.br", // SEU DOMÍNIO DE PRODUÇÃO
                        "null" // Para testes locais abrindo o arquivo file:///... (use com cautela)
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*") // Permite todos os cabeçalhos
                .allowCredentials(false); // Mude para true se você usar cookies/autenticação baseada em sessão
    }
}