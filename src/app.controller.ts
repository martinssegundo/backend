import { Controller, Get, Param } from '@nestjs/common';
import { AppService } from './app.service';

@Controller()
export class AppController {
  constructor(private readonly appService: AppService) {}

  @Get('challenges')
  async getChallenges(): Promise<any> {
    const {data, error} = await this.appService.supabase
    .from('challenges')
    .select()

    return data;
  }

  @Get('challenges/:id')
  async getChallengeById(@Param() params: any): Promise<any> {
    const {data, error} = await this.appService.supabase
    .from('challenges')
    .select()
    .eq('id', params.id)

    return data[0];
  }
}
