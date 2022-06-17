package org.proxiBanqueSI.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason="No such Order")
public class OrderNotFoundException extends RuntimeException {
	
}
