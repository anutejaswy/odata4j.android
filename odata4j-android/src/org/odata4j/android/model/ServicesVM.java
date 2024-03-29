package org.odata4j.android.model;

import java.util.ArrayList;
import java.util.List;

import org.odata4j.examples.ODataEndpoints;

public class ServicesVM {

  public List<ServiceVM> getServices() {
    List<ServiceVM> rt = new ArrayList<ServiceVM>();
    rt.add(new ServiceVM("Netflix", ODataEndpoints.NETFLIX));
    rt.add(new ServiceVM("Baseball Stats", ODataEndpoints.BASEBALL_STATS));

    rt.add(new ServiceVM("TechEd 2010", ODataEndpoints.TECH_ED));
    rt.add(new ServiceVM("TechEd Europe 2010", ODataEndpoints.EU_TECH_ED));
    rt.add(new ServiceVM("eBay", ODataEndpoints.EBAY));
    rt.add(new ServiceVM("Nuget", ODataEndpoints.NUGET));
    rt.add(new ServiceVM("Telerik TV", ODataEndpoints.TELERIK_TV));

    rt.add(new ServiceVM("Stack Overflow", ODataEndpoints.STACK_OVERFLOW));
    rt.add(new ServiceVM("odata.org", ODataEndpoints.ODATA_WEBSITE_DATA));
    rt.add(new ServiceVM("OGDI", ODataEndpoints.OGDI_DC));
    rt.add(new ServiceVM("World Cup", ODataEndpoints.WORLD_CUP));
    rt.add(new ServiceVM("Northwind", ODataEndpoints.NORTHWIND));

    rt.add(new ServiceVM("odata4j-sample.cloudfoundry", ODataEndpoints.ODATA4J_SAMPLE_CLOUDFOUNDRY));
    rt.add(new ServiceVM("odata4j-sample.appspot (https)", "https://odata4j-sample.appspot.com/datastore.svc/"));

    return rt;
  }

}
