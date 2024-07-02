import { Controller, Get, HttpException, HttpStatus, Param } from '@nestjs/common';
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

  @Get('leads/:email')
  async insertLead(@Param() { email }: any): Promise<any> {
    const { error } = await this.appService.supabase
    .from("leads")
    .insert({ email: email})

    const emailData = email;
    
    if(emailData.includes('@') && emailData.includes('.')) {
      return { data: email };
    }

    throw new HttpException('Unprocessable Entity', HttpStatus.UNPROCESSABLE_ENTITY);
  }
}
