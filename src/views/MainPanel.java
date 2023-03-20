package views;


import com.github.Verfarkas02.inputlib.ButtonPanel;
import com.github.Verfarkas02.inputlib.InputPanel;
import com.github.Verfarkas02.inputlib.TitlePanel;

import javafx.scene.layout.VBox;

public class MainPanel extends VBox{
    TitlePanel titlePane;
    InputPanel sidePanel;
    InputPanel alphaPanel;
    ButtonPanel buttonPanel;
    InputPanel radiusPanel;
    public MainPanel() {
        this.titlePane =new TitlePanel();
        this.sidePanel =new InputPanel();
        this.alphaPanel =new InputPanel();
        this.buttonPanel =new ButtonPanel();
        this.radiusPanel =new InputPanel();

        this.titlePane.setText("Rombuszba írható kör sugara");
        this.sidePanel.setText("oldal");
        this.alphaPanel.setText("alfa szög");
        this.buttonPanel.setCalcButtonText("Számít");
        this.radiusPanel.setText("Sugár");

        this.getChildren().add(this.titlePane);
        this.getChildren().add(this.sidePanel);
        this.getChildren().add(this.alphaPanel);
        this.getChildren().add(this.buttonPanel);
        this.getChildren().add(this.radiusPanel);
    }
    public ButtonPanel getButtonPanel() {
        return this.buttonPanel;
    }
    public InputPanel getSidePanel(){
        return this.sidePanel;
    }
    public InputPanel getAlphaPanel(){
        return this.alphaPanel;
    }
    public InputPanel getRadiusPanel(){
        return this.radiusPanel;
    }
}
