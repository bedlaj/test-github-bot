
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.sip.Domain}.
 */
@ApiParams(apiName = "sip-domain", description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a DomainCreator to execute create", signatures={"com.twilio.rest.api.v2010.account.sip.DomainCreator creator(String domainName)", "com.twilio.rest.api.v2010.account.sip.DomainCreator creator(String pathAccountSid, String domainName)"}), @ApiMethod(methodName = "deleter", description="Create a DomainDeleter to execute delete", signatures={"com.twilio.rest.api.v2010.account.sip.DomainDeleter deleter(String pathSid)", "com.twilio.rest.api.v2010.account.sip.DomainDeleter deleter(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", description="Create a DomainFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.sip.DomainFetcher fetcher(String pathSid)", "com.twilio.rest.api.v2010.account.sip.DomainFetcher fetcher(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "reader", description="Create a DomainReader to execute read", signatures={"com.twilio.rest.api.v2010.account.sip.DomainReader reader()", "com.twilio.rest.api.v2010.account.sip.DomainReader reader(String pathAccountSid)"}), @ApiMethod(methodName = "updater", description="Create a DomainUpdater to execute update", signatures={"com.twilio.rest.api.v2010.account.sip.DomainUpdater updater(String pathSid)", "com.twilio.rest.api.v2010.account.sip.DomainUpdater updater(String pathAccountSid, String pathSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer
public final class SipDomainEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The unique address on Twilio to route SIP traffic")})
    private String domainName;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "deleter", description="The SID of the Account that created the resources to delete"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that created the resource to fetch"), @ApiMethod(methodName = "reader", description="The SID of the Account that created the resources to read"), @ApiMethod(methodName = "updater", description="The SID of the Account that created the resource to update")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="The unique string that identifies the resource"), @ApiMethod(methodName = "fetcher", description="The unique string that identifies the resource"), @ApiMethod(methodName = "updater", description="The unique string that identifies the resource")})
    private String pathSid;

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
