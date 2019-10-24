package com.controllers;

import com.models.Biodata;
import com.services.LoansServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Loans {

    @Autowired
    LoansServiceInterface loansServiceInterface;

    @ResponseBody
    @GetMapping(value = "/")
    public String ping(){
        return "Ping Successfull";
    }

    @ResponseBody
    @PostMapping(path = "newLoan")
    public String newLoan(@RequestBody Biodata payload){
        loansServiceInterface.newLoan(payload);
        return "Successfull";
    }

    @ResponseBody
    @PostMapping(path = "dueLoan")
    public String dueLoan(@RequestBody Biodata payload){
//        loansServiceInterface.newLoan(payload);
        return "Successfull";
    }

    @ResponseBody
    @PostMapping(path = "missedRepayments")
    public String missedRepayments(@RequestBody Biodata payload){
//        loansServiceInterface.newLoan(payload);
        return "Successfull";
    }

    @ResponseBody
    @PostMapping(path = "loansInArrears")
    public String loansInArrears(@RequestBody Biodata payload){
//        loansServiceInterface.newLoan(payload);
        return "Successfull";
    }

    @ResponseBody
    @PostMapping(path = "noRepayments")
    public String noRepayemnts(@RequestBody Biodata payload){
//        loansServiceInterface.newLoan(payload);
        return "Successfull";
    }

    @ResponseBody
    @PostMapping(path = "pastMaturityDate")
    public String pastMaturityDate(@RequestBody Biodata payload){
//        loansServiceInterface.newLoan(payload);
        return "Successfull";
    }

    @ResponseBody
    @PostMapping(path = "principalOutStanding")
    public String principalOutstanding(@RequestBody Biodata payload){
//        loansServiceInterface.newLoan(payload);
        return "Successfull";
    }

    @ResponseBody
    @PostMapping(value = "oneMonthLateLoan")
    public String oneMonthsLateLoan(@RequestBody Biodata payload){
//        loansServiceInterface.newLoan(payload);
        return "Successfull";
    }

    @ResponseBody
    @PostMapping(path = "gurantors")
    public String gurantors(@RequestBody Biodata payload){
//        loansServiceInterface.newLoan(payload);
        return "Successfull";
    }

    @ResponseBody
    @PostMapping(path = "loanComments")
    public String loanCommnents(@RequestBody Biodata payload){
//        loansServiceInterface.newLoan(payload);
        return "Successfull";
    }

}
