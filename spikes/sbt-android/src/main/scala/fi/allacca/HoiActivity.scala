package fi.allacca

import android.app.Activity
import android.os.Bundle

class HoiActivity extends Activity with TypedActivity {
  override def onCreate(bundle: Bundle) {
    super.onCreate(bundle)
    setContentView(R.layout.main)
    findView(TR.textview).setText("Hoi sbt-androidista!")
  }
}
