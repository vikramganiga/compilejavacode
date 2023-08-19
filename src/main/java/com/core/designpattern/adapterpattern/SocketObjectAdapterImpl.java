package com.core.designpattern.adapterpattern;

public class SocketObjectAdapterImpl implements SocketAdapter {

    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
        
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'get120Volt'");
    }

    @Override
    public Volt get12Volt() {

        Volt v= socket.getVolt();
		return convertVolt(v,10);

        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'get12Volt'");
    }

    @Override
    public Volt get3Volt() {
        
		Volt v= socket.getVolt();
		return convertVolt(v,40);

        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'get3Volt'");
    }

    private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
    
}
