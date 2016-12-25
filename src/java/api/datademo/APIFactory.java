package api.datademo;

import api.datademo.calls.DataDemo;

/**
 *
 * @author dgallagher
 */
public class APIFactory {
    
    public static final APICall getCall(final String call) {
        if("datademo".equalsIgnoreCase(call)) {
            return new DataDemo();
        }
        return new DataDemo();
    }
}
