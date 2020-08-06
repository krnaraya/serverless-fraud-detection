package org.redhat;

import org.redhat.Transaction;
import io.cloudevents.json.Json;

public class ProcessTransactions {

    public void processTransaction(Transaction transactions) {
       
        System.out.println("transactions being processed : " + Json.encode(transactions));
       
    }
    
}