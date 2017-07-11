
package org.mule.modules.rest.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.rest.RestConnector;


/**
 * A <code>RestConnectorCapabilitiesAdapter</code> is a wrapper around {@link RestConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-10T02:00:40+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class RestConnectorCapabilitiesAdapter
    extends RestConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
