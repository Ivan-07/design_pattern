package com.ivan;

import java.util.Iterator;

/**
 * @author maohao
 */
public class ListVisitor extends Visitor{
    private String currentDir = "";
    @Override
    public void visit(File file) {
        System.out.println(currentDir+"/"+file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir+"/"+directory);
        String  saveDir = currentDir;
        currentDir = currentDir+"/"+directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
