package Service;

import Entity.reservation;
import Helpers.DbConnect;
import IService.IService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServiceReservation implements IService <reservation>{

    Connection cnx;

    public ServiceReservation() {
        cnx = DbConnect.getConnect();
    }
    @Override
    public void add(reservation t) throws SQLException {

        Statement st = cnx.createStatement();
        String query = "insert into reservation (id,nom_c,prenom_c,email,ville,code_postale,adresse,telephone)values(NULL, '" + t.getNom_c() + "', '" + t.getPrenom_c() + "', '" +t.getEmail()+ "', '" + t.getVille() +"','"+t.getCode_postale()+ "','" + t.getAdresse() + "','" + t.getTelephone() + "')";
        st.executeUpdate(query);
    }

    @Override
    public List<reservation> read() throws SQLException {
        List<reservation> ls = new ArrayList<reservation>();
        Statement st = cnx.createStatement();
        String req = "select * from reservation order by id";
        ResultSet rs = st.executeQuery(req);
        while (rs.next()) {
            Integer idoffre = rs.getInt("id");
            String titleoffre = rs.getString("nom_c");
            String priceoffre = rs.getString("prenom_c");
            String nombreplace = rs.getString("email");
            String description = rs.getString("ville");
            String laocalisation = rs.getString("code_postale");
            String style = rs.getString("adresse");
            String image = rs.getString("telephone");
            reservation p = new reservation(idoffre,titleoffre,priceoffre,nombreplace,description,laocalisation,style,image);
            ls.add(p);
        }

        return ls;
    }

    @Override
    public void update(reservation t) throws SQLException {

        Statement st = cnx.createStatement();


        String query = "UPDATE `reservation` SET `nom_c` = '" + t.getNom_c() + "',`prenom_c` = '" + t.getPrenom_c() + "', `email` = '" + t.getEmail() + "', `ville` = '" + t.getVille() + "', `code_postale` = '" + t.getCode_postale() + "', `adresse` = '"
                + t.getAdresse() + "', `telephone` = '" + t.getTelephone() + "' WHERE `reservation`.`id` = " + t.getIdResrv() + " ;";
        st.executeUpdate(query);

    }

    @Override
    public void delete(Long id) throws SQLException {
        Statement st = cnx.createStatement();
        String query = "DELETE FROM `reservation` WHERE `reservation`.`id` = '" + id + "'";
        st.executeUpdate(query);

    }



    public List<reservation> readrecommended() throws SQLException {
        List<reservation> ls = new ArrayList<reservation>();
        Statement st = cnx.createStatement();
        String req = "select * from reservation  where nom_c='testme' order by id";
        ResultSet rs = st.executeQuery(req);
        while (rs.next()) {
            Integer idoffre = rs.getInt("idReserv");
            String titleoffre = rs.getString("nom_c");
            String priceoffre = rs.getString("prenom_c");
            String nombreplace = rs.getString("email");
            String description = rs.getString("ville");
            String laocalisation = rs.getString("code_postale");
            String style = rs.getString("adresse");
            String image = rs.getString("telephone");
            reservation p = new reservation(idoffre,titleoffre,priceoffre,nombreplace,description,laocalisation,style,image);
            ls.add(p);
        }

        return ls;
    }



}
