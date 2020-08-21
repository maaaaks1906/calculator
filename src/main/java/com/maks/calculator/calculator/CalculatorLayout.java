package com.maks.calculator.calculator;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class CalculatorLayout extends VerticalLayout {
    private TextField content = new TextField("", "Equation");
}
