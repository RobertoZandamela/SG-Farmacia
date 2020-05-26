/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.farmacia.util.cadastro;


import javafx.scene.Node;
import javafx.scene.control.Tooltip;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;

/**
 *
 * @author Roberto
 */
public class ValidaExibeToolTip {
    // Adcionar e remover os estilos da borda
    public static void adicionarCorBordaToolTip(Node n, Tooltip t){
       Tooltip.install(n, t);
       n.setStyle("-fx-border-color: #00CED1;");
    }
    
    public static void removerCorBordaToolTip(Node n, Tooltip t){
        Tooltip.uninstall(n, t);
        n.setStyle(null);
    }
    
    public static void mensagem(Node n, Tooltip t){
        Tooltip.install(n,t);
    }
    
    // Exibição do Tooltip (Duração e comportamento)
    public static void tempoToolTip(Tooltip tooltip) throws NoSuchFieldException, IllegalAccessException{
        try{
            java.lang.reflect.Field fieldBehavior = tooltip.getClass().getDeclaredField("BEHAVIOR");
           fieldBehavior.setAccessible(true);
           Object objBehavior = fieldBehavior.get(tooltip);
           
            java.lang.reflect.Field fieldTimer;
            fieldTimer = objBehavior.getClass().getDeclaredField("activationTimer");
           fieldTimer.setAccessible(true);
           Timeline objTimer = (Timeline) fieldTimer.get(objBehavior);
           
           objTimer.getKeyFrames().clear();
           objTimer.getKeyFrames().add(new KeyFrame(new Duration(3)));
           
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e){
            System.out.println("Falha no tratamento");
        }
    }
}
