package org.proxiBanqueSI.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrentAccount extends Account {

	private float overdraft;
}
