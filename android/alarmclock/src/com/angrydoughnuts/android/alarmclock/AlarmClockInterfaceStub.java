package com.angrydoughnuts.android.alarmclock;

import android.content.Context;
import android.os.RemoteException;
import android.widget.Toast;

// TODO(cgallek): Remove these toasts.
// TODO(cgallek): This class can probably move as an inner class
// of AlarmClockService.
public class AlarmClockInterfaceStub extends AlarmClockInterface.Stub {
  private Context context;
  private AlarmClockService service;
  
  AlarmClockInterfaceStub(Context context, AlarmClockService service) {
    this.context = context;
    this.service = service;
  }

  @Override
  public void newAlarm(int minutesAfterMidnight) throws RemoteException {
    Toast.makeText(context, "SCHEDULE ALARM! " + minutesAfterMidnight, Toast.LENGTH_SHORT).show();
    service.newAlarm(minutesAfterMidnight);
  }

  @Override
  public void deleteAlarm(long alarmId) throws RemoteException {
    Toast.makeText(context, "DELETE ALARM! " + alarmId, Toast.LENGTH_SHORT).show();
    service.deleteAlarm(alarmId);
  }

  @Override
  public void scheduleAlarm(long alarmId) throws RemoteException {
    Toast.makeText(context, "SCHEDULE ALARM " + alarmId, Toast.LENGTH_SHORT).show();
    service.scheduleAlarm(alarmId);
  }

  @Override
  public void dismissAlarm(long alarmId) {
    Toast.makeText(context, "DISMISS ALARM " + alarmId, Toast.LENGTH_SHORT).show();
    service.dismissAlarm(alarmId);
  }
}