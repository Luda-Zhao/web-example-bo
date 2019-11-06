import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by zhaol on 2019/10/18.
 */
public class helloSelvlet extends HttpServlet {
    private static final Logger LOGGER=Logger.getLogger(helloSelvlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info("doGet() be called");
        resp.getWriter().write("response from helloservlet");

    }
}
