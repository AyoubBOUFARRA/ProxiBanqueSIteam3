package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.model.Manager;

public interface IManagerService {

	public Manager addManager(Manager m);
	public List<Manager> listManagers();
	public void deleteManagerById(Long id);
	public Manager updateManager(Manager client);
}
