package com.viking.vikingbudget.vikingbudgetservice.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.Timestamp;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.SetOptions;
import com.viking.vikingbudget.vikingbudgetservice.model.Account;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class AccountService {

    private final Firestore firestore;

    public AccountService(Firestore firestore) {
        this.firestore = firestore;
    }

    public void insertAccount(Account account) {
        account.setCreateTs(Timestamp.now());
        account.setModifyTs(Timestamp.now());
        firestore.collection("accounts").document(account.getId()).create(account);
    }

    public Account retrieveAccount(String accountId) throws ExecutionException, InterruptedException {
        ApiFuture<DocumentSnapshot> documentSnapshotApiFuture = firestore.collection("accounts").document(accountId).get();
        return documentSnapshotApiFuture.get().toObject(Account.class);
    }

    public void updateAccount(Account account) throws ExecutionException, InterruptedException {
        account.setModifyTs(Timestamp.now());
        firestore.collection("accounts").document(account.getId()).set(account, SetOptions.merge());
    }

}
