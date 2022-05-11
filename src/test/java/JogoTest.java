import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 ** created by: jorge.lessa
 */

class JogoTest {

    @Test
    void retornarJogo()
    {
        JogoBuilder jogoBuilder = new JogoBuilder();
        Jogo jogo = jogoBuilder
                .setNome("Fifa 22")
                .build();

        assertNotNull(jogo);
    }

    @Test
    void excecaoJogoSemNome()
    {
        try
        {
            JogoBuilder jogoBuilder = new JogoBuilder();
            Jogo jogo = jogoBuilder
                    .setNome("Fifa 22")
                    .build();
        } catch (IllegalArgumentException e)
        {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

}