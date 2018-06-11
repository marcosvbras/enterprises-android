package com.marcosvbras.empresas;

public interface BaseViewModelCallback {

    void showMessage(String message);

    void showMessage(int message);

    void showError(String message);

    void showError(int message);

}
