/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestingTechnique;

import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;

/**
 *
 * @author Lenovo
 */
public class IntregatedNetworkTest {
    
    private NetworkPropagation np;
    private RandomWalk rw;
    private InterConnectivity ic;
    private NeighborhoodScoring ns;
    
    public IntregatedNetworkTest(){
        np = new NetworkPropagation();
        rw = new RandomWalk();
        ic = new InterConnectivity();
        ns = new NeighborhoodScoring();
        
        
    }

    public NetworkPropagation getNp() {
        return np;
    }

    public void setNp(NetworkPropagation np) {
        this.np = np;
    }

    public RandomWalk getRw() {
        return rw;
    }

    public void setRw(RandomWalk rw) {
        this.rw = rw;
    }

    public InterConnectivity getIc() {
        return ic;
    }

    public void setIc(InterConnectivity ic) {
        this.ic = ic;
    }

    public NeighborhoodScoring getNs() {
        return ns;
    }

    public void setNs(NeighborhoodScoring ns) {
        this.ns = ns;
    }
    
    
    
        
    
    
}
