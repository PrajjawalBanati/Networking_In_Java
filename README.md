# Networking_In_Java
Networking means communication between two or more devices connected in a network. Networking allows sharing of files, data among a group
of users. Java allows user to develop a complete system to communicate between certain users.

## Pre-Requistes
- Difference between LAN-MAN-WAN.
- What is WWW(World Wide Web)?
- IP Address Concept
- Port Number
- MAC address
- What is a Socket ?
- Networking Protocols
- TCP-IP
- UDP

## Java Networking
 For networking in Java firstly we should know that how many sockets java allows us to use ? Java allows us to use two sockets:
 - Stream Sockets
 > Stream Sockets use TCP protocol to create a communication between two systems. Here data flows in the form of Continous Streams while the connection is in place.
 
 - Datagram Sockets
 > Datagram Sockets use UDP protocol in which the packets of information are shared between two systems. It is Connection-less service protocol.
 
## Classes In Java 
 - Different classes through which the connection related information can be accessed are :-
  > - [URL](https://github.com/PrajjawalBanati/Networking_In_Java/tree/master/1.%20URL)
  > - [URLConnection](https://github.com/PrajjawalBanati/Networking_In_Java/tree/master/2.%20URLConnection)
  > - [HttpURLConnection](https://github.com/PrajjawalBanati/Networking_In_Java/tree/master/3.%20HttpURLConnection)
  > - [InetAddress](https://github.com/PrajjawalBanati/Networking_In_Java/tree/master/4.%20InetAddress)
 
 - Different classes through which the communication could be done between two systems are :-
  > - [DatagramSocket](https://github.com/PrajjawalBanati/Networking_In_Java/tree/master/5.%20DatagramSocket)
  > - [ServerSocket](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/8.%20ServerSocket/ServerSocketclass.java)
  > - [Socket](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/8.%20ServerSocket/Socketclass.java)
 
 - These all classes are included in `java.net.*` package. 
 
 ## Communication Using UDP
 
 ### One-Way Communication
 - First Run the **Server.java** program so that server gets ready to recieve the messages then run the **Client.java** program.
 - #### [Server.java](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/6.%20Communication%20Using%20UDP/UDPServer.java)
 
      ![img0](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/Images/UDP_OneWayServer.JPG)
 
 - #### [Client.java](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/6.%20Communication%20Using%20UDP/UDPClient.java)    
      
      ![img1](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/Images/UDP_OneWayClient.JPG)
     
 ### Two-Way Communication
- First Run the **Server.java** program so that server gets ready to recieve the messages then run the **Client.java** program.
- #### [Server.java](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/7.%20Two%20Way%20Communication%20using%20UDP/UDPServer.java)

     ![img0](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/Images/UDP_TwoWayServer.JPG)
     
- #### [Client.java](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/7.%20Two%20Way%20Communication%20using%20UDP/UDPClient.java)

     ![img1](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/Images/UDP_TwoWayClient.JPG)

 ## Communication Using TCP
 
 ### One-Way Communication
 - First Run the **Server.java** program so that server gets ready to recieve the messages then run the **Client.java** program.
 - #### [Server.java](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/9.%20Communication%20using%20TCP/TcpServer.java)
 
      ![img0](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/Images/TCP_OneWayServer.JPG)
 
 - #### [Client.java](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/9.%20Communication%20using%20TCP/TcpClient.java)    
      
      ![img1](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/Images/TCP_OneWayClient.JPG)
     
 ### Two-Way Communication
 - First Run the **Server.java** program so that server gets ready to recieve the messages then run the **Client.java** program.
- #### [Server.java](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/10.%20Two%20Way%20Communication%20using%20TCP/TcpServer.java)

     ![img0](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/Images/TCP_TwoWayServer.JPG)
     
- #### [Client.java](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/10.%20Two%20Way%20Communication%20using%20TCP/TcpClient.java)

     ![img1](https://github.com/PrajjawalBanati/Networking_In_Java/blob/master/Images/TCP_TwoWayClient.JPG)
 
