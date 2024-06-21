import { Injectable } from '@nestjs/common';
import { SupabaseClient, createClient } from '@supabase/supabase-js';

@Injectable()
export class AppService {
  public supabase!: SupabaseClient;

  constructor() {
    this.supabase = createClient('https://ujmvnzcbcgavpknmqcfx.supabase.co', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InVqbXZuemNiY2dhdnBrbm1xY2Z4Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3MTU3MjkyNTEsImV4cCI6MjAzMTMwNTI1MX0.B0AxNh-3Z2ZrZc5F2xnHetG2deK1MXWaHbtbsRr9vPo');
  }

  getHello(): string {
    return 'Hello World!';
  }
}
