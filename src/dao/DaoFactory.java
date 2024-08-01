package dao;

import dao.custom.impl.UserDaoImpl;

public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory(){

    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoType daoType){
        switch (daoType) {
            case USER:
                return new UserDaoImpl();
        
            default:
                return null;
        }
    }

    public enum DaoType{
        USER,ADMIN,BOOK;
    }
}
