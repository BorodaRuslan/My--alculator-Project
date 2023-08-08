package Controller;

import Model.ModelLogics;
import View.ViewOptions;

import java.util.ArrayList;

public class ControllerData {




    public static void filterOptions(int userChoice){
        switch (userChoice){
            case 1 -> {
                ArrayList<Integer> dataFromUser = ViewOptions.getDataFromUser();
                String resultString = ModelLogics.plus(dataFromUser);
                ViewOptions.getResult(resultString);
            }

        }
    }
}
