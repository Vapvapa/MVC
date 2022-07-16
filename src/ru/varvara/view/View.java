package ru.varvara.view;

import ru.varvara.controller.Controller;
import ru.varvara.model.ModelData;

public interface View {
    void refresh(ModelData modelData);

    void setController(Controller controller);
}