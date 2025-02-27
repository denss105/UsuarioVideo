/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarioVideo;

import java.util.*;

/**
 *
 * @author Danai Bezares
 */
public class usuarioVideo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Usuario usuario = new Usuario("Danai", "danairtg44389@gmail.com");
        Video vid = new Video("Nueva Era", 60);
        Comentario coment = new Comentario();
        usuario.verVideo(vid);
        vid.detener();
        //comentario
        String com;
        System.out.println("añade un comentario");
        com = s.next();
        coment.comentariVideo(com);

    }

}
