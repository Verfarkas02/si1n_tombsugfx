package controllers;


import javafx.scene.control.Button;
import models.MainModel;
import views.MainPanel;

public class MainController {
    MainPanel mainPanel;
    MainModel mainModel;

    public MainController() {
        this.mainPanel = new MainPanel();
        this.mainModel =new MainModel();
        this.handlerEvent();
    }
    public MainPanel getMainPanel(){
        return this.mainPanel;
    }
    public void handlerEvent(){
        Button calcbutton= this.mainPanel.getButtonPanel().getCalcButton();
        calcbutton.setOnAction(e -> {
            String sideStr= this.mainPanel.getSidePanel().getValue();
            String alphaStr =this.mainPanel.getAlphaPanel().getValue();
            double side =Double.parseDouble(sideStr);
            double alpha =Double.parseDouble(alphaStr);
            double radius = this.mainModel.calcRadius(side, alpha);
            System.out.println("Sugár: "+radius);
            this.mainPanel.getRadiusPanel().setValue(toString());
        });
        
    }
}
