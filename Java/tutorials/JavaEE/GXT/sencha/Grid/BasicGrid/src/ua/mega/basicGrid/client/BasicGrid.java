package ua.mega.basicGrid.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import ua.mega.basicGrid.client.grid.MyGrid;

public class BasicGrid implements EntryPoint {

    public void onModuleLoad() {
        MyGrid grid = new MyGrid();
        RootPanel.get().add(grid);
    }
}
