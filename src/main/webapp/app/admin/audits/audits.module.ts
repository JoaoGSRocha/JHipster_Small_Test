import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { JHipsterSmallTestSharedModule } from 'app/shared/shared.module';

import { AuditsComponent } from './audits.component';

import { auditsRoute } from './audits.route';

@NgModule({
  imports: [JHipsterSmallTestSharedModule, RouterModule.forChild([auditsRoute])],
  declarations: [AuditsComponent],
})
export class AuditsModule {}
