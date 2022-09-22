package inv.controller;

import inv.view.AppFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InvoiceController implements ActionListener {

    private AppFrame frameInvoice; 
    

    public InvoiceController(AppFrame frame) {
        this.frameInvoice = frameInvoice;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {

            case "Create Invoice":
                createInvoice();
                break;
            case "Delete Invoice":
                delteInvoice();
                break;

            case "New Invoice Item":
                newInvoiceItem();
                break;

            case "Delete Invoice Item":
                deleteInvoiceItem();
                break;

            case "Load Files":
                loadFiles();
                break;

            case "Save Data":
                saveData();
                break;
        }
    }

    private void createInvoice() {
    }

    private void delteInvoice() {
    }

    private void newInvoiceItem() {
    }

    private void deleteInvoiceItem() {
    }

    private void loadFiles()  {

    }

    private void saveData() {
    }

}
