package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Module {

    @Id
    private int ModuleId;
    private String ModuleName;



    public Module() {
    }

    public int getModuleId() {
        return ModuleId;
    }

    public void setModuleId(int moduleId) {
        ModuleId = moduleId;
    }

    public String getModuleName() {
        return ModuleName;
    }

    public void setModuleName(String moduleName) {
        ModuleName = moduleName;
    }


}


