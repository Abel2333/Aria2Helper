Dim allConfig
set wshShell = CreateObject("WScript.Shell")
set oArgs = WScript.Arguments
Wscript.echo oArgs.Item(0)
allConfig = ""
	For i = 1 to oArgs.Count-1
		allConfig = allConfig & CStr(oArgs.Item(i)) & " "
	Next
'test = createobject("Scripting.FileSystemObject").GetFolder(".").Path
'Wscript.echo test
Wscript.echo allConfig
wshShell.CurrentDirectory = oArgs.Item(0)
wshShell.Run """aria2c.exe""" & Chr(34)&allConfig&Chr(34),0
set oArgs = Nothing
set wshShell = Nothing