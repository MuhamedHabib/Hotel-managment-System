package Service;

import Entity.offre;
import Helpers.DbConnect;
import IService.IService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServiceOffre implements IService<offre> {

    Connection cnx;
    public ServiceOffre() {
        cnx = DbConnect.getConnect();
    }



    /*
     * CRUD
     *  */

    /**
     *
     * @param offre
     * @throws SQLException
     */
    @Override
    public void add(offre offre) throws SQLException {

        Statement st=cnx.createStatement();
        String query = "insert into offre (id,title,image,price,category)values(NULL, '" + offre.getTitle() + "', '" + offre.getImage() + "', '" +offre.getPrice()+"', '"+offre.getCategory()+  "')";
        st.executeUpdate(query);
    }




    @Override
    public List<offre> read() throws SQLException {

        List<offre> ls = new ArrayList<offre>();
        Statement st = cnx.createStatement();
        String req = "select * from category order by id";
        ResultSet rs = st.executeQuery(req);
        while (rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            String image = rs.getString("image");

            //   LocalDate born = rs.getDate("born").toLocalDate();
            double price = rs.getDouble("price");
            String category = rs.getString("category");
            offre p = new offre(id,title,image,price,category);
            ls.add(p);
        }


        return ls;

    }

    @Override
    public void update(offre t) throws SQLException {

        Statement st = cnx.createStatement();


        String query = "UPDATE `offre` SET `title` = '" + t.getTitle() + "',`image` = '" + t.getImage()
                + "', `price` = '" + t.getPrice() + "', `category` = '" + t.getCategory()
                + "' WHERE `offre`.`id` = " + t.getId() + " ;";
        st.executeUpdate(query);
    }

    @Override
    public void delete(Long id) throws SQLException {

        Statement st =cnx.createStatement();
        String query = "DELETE FROM `offre` WHERE `offre`.`id` = '" + id + "'";
        st.executeUpdate(query);

    }


}
