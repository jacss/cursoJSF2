package com.br.cursojsf.visao;

import javax.faces.bean.ManagedBean;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
@ManagedBean
public class RegistroCliqueBotaoListener implements ActionListener {

	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		System.out.println("Clicando do bot�o" + event.getComponent().getId());
		
	}

}
