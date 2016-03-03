package vn.com.enclave.phatbeo.ut.mockito.demo;
/**
 * @author Phat (Phillip) H. VU <vuhongphat@hotmail.com>
 * 
 */
public interface PersonDao
{
    public Person fetchPerson( Integer personID );
    public void update( Person person );
} 