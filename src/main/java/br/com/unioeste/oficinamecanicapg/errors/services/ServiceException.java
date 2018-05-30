package br.com.unioeste.oficinamecanicapg.errors.services;

/**
 * Created by alanna on 09/10/17.
 */
public class ServiceException extends RuntimeException {

    public ServiceException(String message) {
        super(message);
    }
}