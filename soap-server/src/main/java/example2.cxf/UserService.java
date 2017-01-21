package example2.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author Lenovo
 * @date 2016-08-30
 * @modify
 * @copyright
 */
@WebService
public interface UserService {
    @WebMethod
    String getName(@WebParam(name = "userId") Long userId);

    @WebMethod
    User getUser(Long userId);
}
