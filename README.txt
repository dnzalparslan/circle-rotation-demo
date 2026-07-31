UDP Command Flow
User types "goto 90"
        ↓
UdpCircleClient.buildCommandFrame()
        ↓
Circle byte[] frame
        ↓
UdpClient.sendMessage(frame)
        ↓
one UDP datagram
        ↓
UdpServer.receiveMessage()
        ↓
deliverMessage(frame)
        ↓
Circle handler
        ↓
parser.parse(frame)
        ↓
dispatcher.dispatch(result)
        ↓
ACK byte[]
        ↓
UdpServer.sendMessage(ack)
        ↓
UdpCircleClient handler
        ↓
decodeResponse(ack)



TCP Command Flow
User types "goto 90"
        ↓
TcpCircleClient.buildCommandFrame()
        ↓
Circle byte[] frame
        ↓
TcpClient.sendMessage(frame)
        ↓
[length][Circle frame]
        ↓
TcpServer.readInt()
        ↓
TcpServer.readFully(frame)
        ↓
deliverMessage(frame)
        ↓
Circle handler
        ↓
parser.parse(frame)
        ↓
dispatcher.dispatch(result)
        ↓
ACK byte[]
        ↓
TcpServer.sendMessage(ack)
        ↓
[length][ACK frame]
        ↓
TcpClient removes length
        ↓
TcpCircleClient handler
        ↓
decodeResponse(ack)
