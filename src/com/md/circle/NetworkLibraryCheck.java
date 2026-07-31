package com.md.circle;

import com.md.network.Network;
import com.md.network.tcp.TcpClient;
import com.md.network.tcp.TcpServer;
import com.md.network.udp.UdpClient;
import com.md.network.udp.UdpServer;

public final class NetworkLibraryCheck {

    private NetworkLibraryCheck() {
    }

    public static void printImportedClasses() {
        System.out.println("Imported network library:");

        System.out.println("  " + Network.class.getName());
        System.out.println("  " + TcpClient.class.getName());
        System.out.println("  " + TcpServer.class.getName());
        System.out.println("  " + UdpClient.class.getName());
        System.out.println("  " + UdpServer.class.getName());
    }
}