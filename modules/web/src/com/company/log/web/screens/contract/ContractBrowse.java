package com.company.log.web.screens.contract;

import com.haulmont.cuba.gui.screen.*;
import com.company.log.contract.Contract;

@UiController("log_Contract.browse")
@UiDescriptor("contract-browse.xml")
@LookupComponent("contractsTable")
@LoadDataBeforeShow
public class ContractBrowse extends StandardLookup<Contract> {
}