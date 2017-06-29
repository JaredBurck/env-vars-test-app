/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gov.ssa.env_vars_app;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * A simple REST service which is able to show the environment variables using EnvVarsService
 * Please take a look at the web.xml where JAX-RS is enabled
 *
 * @author Jared Burck <jburck@redhat.com>
 *
 */

@Path("/")
public class EnvVarsApp {
    @Inject
    EnvVarsService envVarsService;

    @GET
    @Path("/json")
    @Produces({ "application/json" })
    public String getEnvVarsJSON() {
        StringBuilder json = new StringBuilder("{\"env\":[");
        json.append(envVarsService.getEnvVars());
        json.append("]}");
        return json.toString();
//        return "{\"result\":\"" + envVarsService.getEnvVars() + "\"}";
    }

    @GET
    @Path("/xml")
    @Produces({ "application/xml" })
    public String getEnvVarsXML() {
        StringBuilder xml = new StringBuilder("<xml><result>");
        xml.append(envVarsService.getEnvVars());
        xml.append("</result></xml>");
        return xml.toString();
//        return "<xml><result>" + envVarsService.getEnvVars() + "</result></xml>";
    }

}
