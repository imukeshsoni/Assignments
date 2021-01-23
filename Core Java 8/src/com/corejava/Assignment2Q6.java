package com.corejava;

abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() { return "FilePersistance"; }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() { return "DatabasePersistance"; }
}
class Client extends Persistence{
    @Override
    public String persist() { return "ClientPersistance"; }

}
public class Assignment2Q6 {
    public static void main(String[] args) {}
}
