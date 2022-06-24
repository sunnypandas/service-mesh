package me.panpan.mesh.web.rest;

import me.panpan.mesh.model.AccountInfo;
import me.panpan.mesh.service.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/account")
public class AccountInfoController {

    @Autowired
    private AccountInfoService accountInfoService;

    @GetMapping(produces = "application/json")
    public AccountInfo getAccountInfo() {

        AccountInfo accountInfo = new AccountInfo();
        accountInfo.setAccountNo("12345678");
        accountInfo.setOrderDetailList(accountInfoService.getOrderList());

        return accountInfo;
    }
}
