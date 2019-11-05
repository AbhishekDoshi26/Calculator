package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class controller 
{
    @FXML
    private Label result;
    private float num1=0;
    private String operator= "";
    private boolean start=true;
    private model m=new model();
    
     @FXML
    public void processnumber(ActionEvent event)
    {
        if(start)
        {
            result.setText("");
            start=false;
        }
        String value=((Button)event.getSource()).getText();//Reads the text on the button
        result.setText(result.getText()+ value);
    }
    
     @FXML
     public void processoperators(ActionEvent event)
    {
          String value=((Button)event.getSource()).getText();//Reads the operator
          if(!value.equals("="))
          {
              if (!operator.isEmpty()) 
                return;
              operator = value;
              num1=Float.parseFloat(result.getText());
              result.setText(" ");
          }
          else
          {
              if(operator.isEmpty())
                  return;
              float num2=Float.parseFloat(result.getText());
              float output = m.calculate(num1, num2, operator);
              result.setText(String.valueOf(output));
              operator=""; 
            start=true;
          }
    }
}
