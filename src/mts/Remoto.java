package mts;

import java.io.IOException;

public class Remoto {

      public void executarAcessoRemoto() {
        try{
            Runtime.getRuntime().exec("mstsc.exe");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
