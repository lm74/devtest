package com.zhy.smail.pickup.view;

import com.zhy.smail.MainApp;
import com.zhy.smail.cabinet.entity.CabinetInfo;
import com.zhy.smail.common.controller.RootController;
import com.zhy.smail.config.GlobalOption;
import com.zhy.smail.manager.entity.DeliveryLog;
import com.zhy.smail.manager.service.DeliveryLogService;
import com.zhy.smail.restful.RestfulResult;
import com.zhy.smail.restful.RfFaultEvent;
import com.zhy.smail.restful.RfResultEvent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by wenliz on 2017/3/13.
 */
public class PickupLogController extends RootController implements Initializable {
    @FXML
    private Label lblTimer;

    public void setApp(MainApp app) {
        this.app = app;
        app.createTimeout(lblTimer);
        onRefreshAction();
    }

    @FXML
    private CheckBox chkPickuped;
    private CabinetInfo currentCabinet;
    private int periodType = DeliveryLog.THIS_DATE;

    @FXML
    private TableView<DeliveryLog> logTable;
    @FXML
    private TableColumn<DeliveryLog, String> tcDeliveryTime;
    @FXML
    private TableColumn<DeliveryLog, String> tcDeliveryMan;
    @FXML
    private TableColumn<DeliveryLog, String> tcDeliveryType;
    @FXML
    private TableColumn<DeliveryLog, Integer> tcBoxSequence;
    @FXML
    private TableColumn<DeliveryLog, String> tcPickupTime;
    @FXML
    private TableColumn<DeliveryLog, String> tcPickupUser;
    private ObservableList logList;




    public void initialize(URL location, ResourceBundle resources) {
        tcDeliveryTime.setCellValueFactory(new PropertyValueFactory("deliveryTime"));
        tcDeliveryMan.setCellValueFactory(new PropertyValueFactory("deliveryMan"));
        tcDeliveryType.setCellValueFactory(new PropertyValueFactory("deliveryType"));
        tcBoxSequence.setCellValueFactory(new PropertyValueFactory("boxSequence"));
        tcPickupTime.setCellValueFactory(new PropertyValueFactory("pickupTime"));
        tcPickupUser.setCellValueFactory(new PropertyValueFactory("pickupUser"));

        logList = FXCollections.observableArrayList();
        logTable.setItems(logList);

        currentCabinet = GlobalOption.currentCabinet;
        chkPickuped.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                onRefreshAction();
            }
        });

    }

    @FXML
    private void onThisDateAction(ActionEvent event){
        this.periodType = DeliveryLog.THIS_DATE;
        onRefreshAction();
    }

    @FXML
    private void onThisWeekAction(ActionEvent event){
        this.periodType = DeliveryLog.THIS_WEEK;
        onRefreshAction();
    }

    @FXML
    private void onThisMonthAction(ActionEvent event){
        this.periodType = DeliveryLog.THIS_MONTH;
        onRefreshAction();
    }
    @FXML
    private void onOneMonthAction(ActionEvent event){
        this.periodType = DeliveryLog.RECENT_ONE_MONTH;
        onRefreshAction();
    }
    @FXML
    private void onThreeMonthAction(ActionEvent event){
        this.periodType = DeliveryLog.RECENT_THREE_MONTH;
        onRefreshAction();
    }
    @FXML
    private void onAllLogAction(ActionEvent event){
        this.periodType = 0;
        onRefreshAction();
    }

    private void onRefreshAction(){
        logList.clear();
        Integer pickuped = 0;
        if(chkPickuped.isSelected()){
            pickuped = 1;
        }
        DeliveryLogService.listByOwner(currentCabinet.getCabinetId(),GlobalOption.currentUser.getUserId(),pickuped, new RestfulResult() {
                    @Override
                    public void doResult(RfResultEvent event) {
                        if(event.getData() != null){

                            List deliveryLogs = (List)event.getData();
                            logList.addAll(deliveryLogs);
                        }
                    }

                    @Override
                    public void doFault(RfFaultEvent event) {

                    }
                });
    }

    @FXML
    private void onBackAction(ActionEvent event){
        app.goOwner();


    }
}

