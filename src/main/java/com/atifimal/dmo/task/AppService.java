package com.atifimal.dmo.task;

import com.google.gson.JsonElement;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.HashMap;
import java.util.LinkedHashMap;


public interface AppService {
    public Integer getResult(int n);
}